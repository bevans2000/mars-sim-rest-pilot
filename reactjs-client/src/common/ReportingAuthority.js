const ReportingAuthority = (props) => {
    const {authority} = props;
    const listItems = authority.agenda.map((number) =>
    <li>{number}</li>
    );
    return(
        <div>
            <p><label>Name:</label>{ authority.name }</p>
            <p><label>Objective:</label>{ authority.objective}</p>
            <p><label>Agenda:</label><div><ul>{listItems}</ul></div></p>
        </div>
    );
}

export default ReportingAuthority;