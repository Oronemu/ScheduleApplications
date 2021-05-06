import React from 'react';
import { View, Text  } from 'react-native';
import { Button } from 'react-native-paper';

export default function SelectDay(props) {
  return (
    <View className="buttons" style={{ flex: 1, maxHeight: 80, flexDirection: 'row', marginTop: 80, justifyContent: 'space-around', paddingHorizontal: 25 }} >
      <View style={{flex:1}}>
        <Button compact="true" mode="contained" onPress={props.choose1} color="#3A435E" >ПН</Button>
      </View>
      <View style={{flex:1}}>
        <Button compact="true" mode="contained" onPress={props.choose2} color="#3A435E" >ВТ</Button>
      </View>
      <View style={{flex:1}}>
        <Button compact="true" mode="contained" onPress={props.choose3} color="#3A435E" >СР</Button>
      </View>
      <View style={{flex:1}}>
        <Button compact="true" mode="contained" onPress={props.choose4} color="#3A435E" >ЧТ</Button>
      </View>
      <View style={{flex:1}}>
        <Button compact="true" mode="contained" onPress={props.choose5} color="#3A435E" >ПТ</Button>
      </View>
    </View>
  );
}


// <ButtonGroup variant="contained" color="primary" aria-label="contained primary button group"></ButtonGroup>
// module.exports = SelectDay;