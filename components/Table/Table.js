import React from 'react'
import { StyleSheet , Text, View } from 'react-native';
// import './Table.css'

const Table = (props) => {
  const listItems = (props.data) ? props.data.map((lesson, index) => { 
    let gCh, wCh
    (props.group) ? gCh = 2 : gCh = 1;
    (props.week) ? wCh = 'odd' : wCh = 'even';
    if ((gCh === lesson.group || lesson.group === 0) && (wCh === lesson.week || lesson.week === 'all') && (props.days === lesson.day)) {
      return (
        <View className="singularLesson" style={{ justifyContent: "space-around", marginVertical: 50, marginHorizontal: 30 }} >
          <View style={{ flex: 1, alignItems: 'center', justifyContent: 'center', marginBottom: 30}}>
            <View style={{ flex: 1, alignSelf: 'stretch', flexDirection: 'row' , marginBottom: 30}}>
              <View type={lesson.type} style={{ flex: 2, alignSelf: 'stretch' }} ><Text>{lesson.start_time}</Text></View>
              <View style={{ flex: 3, alignSelf: 'stretch' }} ><Text>{lesson.title}</Text></View>
            </View>
            <View style={{ flex: 1, alignSelf: 'stretch', flexDirection: 'row', marginBottom: 30 }}>
              <View type={lesson.type} style={{ flex: 2, alignSelf: 'stretch' }} ><Text>{lesson.end_time}</Text></View>
              <View style={{ flex: 3, alignSelf: 'stretch' }} ><Text>{lesson.type}</Text></View>
            </View>
            <View style={{ flex: 1, alignSelf: 'stretch', flexDirection: 'row', marginBottom: 30 }}>
              <View type={lesson.type} style={{ flex: 2, alignSelf: 'stretch' }} ><Text>{"Ауд. " + lesson.cabinet}</Text></View>
              <View style={{ flex: 3, alignSelf: 'stretch' }} ><Text>{lesson.surname} {lesson.name.charAt(0)}.{lesson.patronymical.charAt(0)}.</Text></View>
            </View>
          </View>
        </View> 
      )
    } else {
      return null;  
    }
  }) : null;

  return(
    <View className="tableWrapper" style={{ marginTop: 20}} >
      {listItems}
    </View>
  )
}

const styles = StyleSheet.create({
  singularLesson: {
    padding: 10
  },
  table: {
    fontFamily: "Lucida Sans Unicode",
    fontSize: 16,
    // borderCollapse: "collapse",
    textAlign: "center",
    minHeight: 187,
}
})

export default Table;
// module.exports = Table;