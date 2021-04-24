import React from 'react';
import Switch from '@material-ui/core/Switch';

const WeekSwitch = (props) => {
  return (
    <Switch
      checked={props.weekChoice}
      onChange={props.onChange}
      name="weekChoice"
      inputProps={{ 'aria-label': 'week checkbox' }}
    />
  );
};

export default WeekSwitch;
