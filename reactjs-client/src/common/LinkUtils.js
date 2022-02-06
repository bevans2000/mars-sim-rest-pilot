import { Link } from "react-router-dom";

export const DETAIL_PANEL = "detail-panel";
export const DETAIL_HEADING = "detail-heading";

// This maps to the UnitReferenceDTO
export function EntityLink(props) {
    const {reference} = props;
    const link = "/" + reference.type + "/" + reference.identifier;
    return (
        <span><Link className="entity-link" to={link}>{reference.name}</Link></span>
    )  
}

// This renders an EntityLink from a table cell
export function EntityCell (props) {
    const {row} = props;
    return (
        <EntityLink reference={row.original}/>
    )  
}
