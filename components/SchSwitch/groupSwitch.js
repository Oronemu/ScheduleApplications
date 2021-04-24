import React from 'react';
import Switch from '@material-ui/core/Switch';

const GroupSwitch = (props) => {
  return (
    <Switch
      checked={props.groupChoice}
      onChange={props.onChange}
      name="groupChoice"
      inputProps={{ 'aria-label': 'group checkbox' }}
    />
  );
};

export default GroupSwitch;
