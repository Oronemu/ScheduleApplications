import { StatusBar } from 'expo-status-bar';
import React, {useState} from 'react';
import { StyleSheet, Text, View } from 'react-native';
import firebase from 'firebase';
import 'firebase/firestore';
import apiKeys from './config/keys';
import currentWeekNumber from 'current-week-number'

export default function App() {
  const [state, setState] = useState ({
    gChoice: false,
    wChoice: false,
    lessons: [],
    selectedDay: 1
  })

  const fetchData = async () => {
    const db = firebase.firestore();
    const data = await db.collection('lessons').get();
    setState({ lessons: data.docs.map((doc) => doc.data()) });
  };

  if (!firebase.apps.length) {
    console.log("Firebase connected");
    firebase.initializeApp(apiKeys.firebaseConfig);
    fetchData();
    if ((currentWeekNumber() + (currentWeekNumber("12/31/2020") - currentWeekNumber('08/30/2020'))) % 2 === 1) {
      setState({ wChoice: true })
    }
    let d = new Date();
    let dayArr = [1, 1, 2, 3, 4, 5, 1];
    setState({ selectedDay: dayArr[d.getDay()] })
  }
  return (
    <View>
      
      <StatusBar style="auto" />
    </View>
  );
}