import React from 'react'
import './Table.css'

const Table = (props) => {
  const listItems = props.data && props.data.map((lesson, index) => { 
    let gCh, wCh
    (props.group) ? gCh = 2 : gCh = 1;
    (props.week) ? wCh = 'odd' : wCh = 'even';
    if ((gCh === lesson.group || lesson.group === 0) && (wCh === lesson.week || lesson.week === 'all') && (props.days === lesson.day)) {
      return (
        <div className="singularLesson" key={index}>
          <table>
            <tr>
              <td type={lesson.type}>{lesson.start_time}</td>
              <td>{lesson.title}</td>
            </tr>
            <tr>
              <td type={lesson.type}>{lesson.end_time}</td>
              <td>{lesson.type}</td>
            </tr>
            <tr>
              <td type={lesson.type}>{"Ауд. " + lesson.cabinet}</td>
              <td>{lesson.surname} {lesson.name.charAt(0)}.{lesson.patronymical.charAt(0)}.</td>
            </tr>
          </table>
        </div> 
      )
    } else {
      return null;
    }
  })

  return(
    <div className="tableWrapper">
    {listItems}
    </div>
  )
}


export default Table;