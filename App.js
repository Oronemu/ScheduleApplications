import { StatusBar } from 'expo-status-bar';
import React, {useState} from 'react';
import { StyleSheet, Text, View } from 'react-native';
import firebase from 'firebase';
import 'firebase/firestore';
import apiKeys from './config/keys';

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
  }
  console.log(state.lessons);
  return (
    <View>
      
      <StatusBar style="auto" />
    </View>
  );
}