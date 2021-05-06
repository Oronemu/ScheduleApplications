import React from 'react';
import { Switch } from 'react-native-paper';

const GroupSwitch = (props) => {
  return (
    <Switch
      value={props.value}
      onValueChange={props.onValueChange}
      name="groupChoice"
    />
  );
};
    
// inputProps={{ 'aria-label': 'group checkbox' }}
export default GroupSwitch;
// module.exports = GroupSwitch;
