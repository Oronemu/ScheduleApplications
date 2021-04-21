import React from 'react';
import Button from '@material-ui/core/Button';
import ButtonGroup from '@material-ui/core/ButtonGroup';

export default function SelectDay(props) {
  return (
    <div className="buttons" >
      <ButtonGroup variant="contained" color="primary" aria-label="contained primary button group">
        <Button onClick={props.choose1}>ПН</Button>
        <Button onClick={props.choose2}>ВТ</Button>
        <Button onClick={props.choose3}>СР</Button>
        <Button onClick={props.choose4}>ЧТ</Button>
        <Button onClick={props.choose5}>ПТ</Button>
      </ButtonGroup>
    </div>
  );
}