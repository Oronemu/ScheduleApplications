import React from 'react';
import { Switch } from 'react-native-paper';

const GroupSwitch = (props) => {
  return (
    <Switch
      value={props.groupChoice}
      onValueChange={props.onChange}
      name="groupChoice"
    />
  );
};
    
// inputProps={{ 'aria-label': 'group checkbox' }}
export default GroupSwitch;
// module.exports = GroupSwitch;
