const PersonHealth = (props) => {
    return(
        <div>
            <p><label>Health:</label>{ props.data.conditionHealth }</p>
            <p><label>Performance:</label>{ props.data.conditionPerformance * 100 } %</p>
            <p><label>Energy:</label>{props.data.conditionEnergy} kJ</p>
        </div>
    );
}

export default PersonHealth;