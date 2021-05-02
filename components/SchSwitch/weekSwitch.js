import React from 'react';
import { Switch } from 'react-native-paper';

const WeekSwitch = (props) => {
  return (
    <Switch
      value={props.weekChoice}
      onValueChange={props.onChange}
      name="weekChoice"
    />
  );
};

export default WeekSwitch;
// module.exports = WeekSwitch;
