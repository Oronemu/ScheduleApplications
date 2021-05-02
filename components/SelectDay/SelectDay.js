import React from 'react';
import { View, Text  } from 'react-native';
import { Button } from 'react-native-paper';

export default function SelectDay(props) {
  return (
    <View className="buttons" >
      <Button mode="contained" onPress={props.choose1}><Text>ПН</Text></Button>
      <Button mode="contained" onPress={props.choose2}><Text>ВТ</Text></Button>
      <Button mode="contained" onPress={props.choose3}><Text>СР</Text></Button>
      <Button mode="contained" onPress={props.choose4}><Text>ЧТ</Text></Button>
      <Button mode="contained" onPress={props.choose5}><Text>ПТ</Text></Button>
    </View>
  );
}


// <ButtonGroup variant="contained" color="primary" aria-label="contained primary button group"></ButtonGroup>
// module.exports = SelectDay;