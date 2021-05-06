// service stuff
import { StatusBar } from 'expo-status-bar';
import React, { useState, Component } from 'react';
import { StyleSheet, Text, View } from 'react-native';
import firebase from 'firebase';
import 'firebase/firestore';
import apiKeys from './config/keys';
import currentWeekNumber from 'current-week-number';
import { Provider as PaperProvider } from 'react-native-paper';

// components
import Table from './components/Table/Table';
import SelectDay from './components/SelectDay/SelectDay';
import GroupSwitch from './components/SchSwitch/groupSwitch'
import WeekSwitch from './components/SchSwitch/weekSwitch'

export class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      gChoice: false,
      wChoice: false,
      lessons: [],
      selectedDay: 1
    };
    this.groupHandler = this.groupHandler.bind(this);
    this.weekHandler = this.weekHandler.bind(this);
    this.dayHandler1 = this.dayHandler1.bind(this);
    this.dayHandler2 = this.dayHandler2.bind(this);
    this.dayHandler3 = this.dayHandler3.bind(this);
    this.dayHandler4 = this.dayHandler4.bind(this);
    this.dayHandler5 = this.dayHandler5.bind(this);
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

  // still doesn't work in a singular function lmao
  dayHandler1 = (event) => {
    this.setState({ selectedDay: 1 })
  }
  dayHandler2 = (event) => {
    this.setState({ selectedDay: 2 })
  }
  dayHandler3 = (event) => {
    this.setState({ selectedDay: 3 })
  }
  dayHandler4 = (event) => {
    this.setState({ selectedDay: 4 })
  }
  dayHandler5 = (event) => {
    this.setState({ selectedDay: 5 })
  }

  render() {
    return (
      <PaperProvider>
        <SelectDay choose1={this.dayHandler1} choose2={this.dayHandler2} choose3={this.dayHandler3} choose4={this.dayHandler4} choose5={this.dayHandler5} />
        <View style={{ alignItems: 'center', marginBottom: 20 }} >
          <Text>1 гр. <GroupSwitch onValueChange={this.groupHandler} value={this.state.gChoice} /> 2гр.</Text>
          <Text>чёт. <WeekSwitch onValueChange={this.weekHandler} value={this.state.wChoice} /> нечёт.</Text>
        </View>
        <View>
          <Table data={this.state.lessons} group={this.state.gChoice} week={this.state.wChoice} days={this.state.selectedDay} />
          <StatusBar style="auto" />
        </View>
      </PaperProvider>
    ); 
  }

}

export default App;