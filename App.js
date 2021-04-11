// service stuff
import { StatusBar } from 'expo-status-bar';
import React, { useState, Component } from 'react';
import { StyleSheet, Text, View } from 'react-native';
import firebase from 'firebase';
import 'firebase/firestore';
import apiKeys from './config/keys';
import currentWeekNumber from 'current-week-number';

// components
import Table from './components/Table/Table';


export class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      gChoice: false,
      wChoice: false,
      lessons: [],
      selectedDay: 1
    }
  }

  componentDidMount() { 
    const fetchData = async () => {
      const db = firebase.firestore();
      const data = await db.collection('lessons').get();
      this.setState({ lessons: data.docs.map((doc) => doc.data()) });
    };

    if (!firebase.apps.length) {
      console.log("Firebase connected");
      firebase.initializeApp(apiKeys.firebaseConfig);
      fetchData();
      if ((currentWeekNumber() + (currentWeekNumber("12/31/2020") - currentWeekNumber('08/30/2020'))) % 2 === 1) {
        this.setState({ wChoice: true })
      }
      let d = new Date();
      let dayArr = [1, 1, 2, 3, 4, 5, 1];
      this.setState({ selectedDay: dayArr[d.getDay()] })
    }
  }

  groupHandler = () => {
    this.setState((prevState) => {
      return { gChoice: !prevState.gChoice }
    })
  }

  weekHandler = () => {
    this.setState((prevState) => {
      return { wChoice: !prevState.wChoice }
    })
  }
  render() {
    return (
      <View>
        <Table data={this.state.lessons} group={this.state.gChoice} week={this.state.wChoice} days={this.state.selectedDay} />
        <StatusBar style="auto" />
      </View>
    );
  }

}

export default App;