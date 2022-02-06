import { useMemo } from "react";
import { EntityCell } from "../common/LinkUtils";
import EntityTable from "../common/EntityTable";

// A Unit table showing all Persons
const PersonTable = () => {

    const columns = useMemo(
        () => [
          {
            Header: 'Name',
            accessor: 'name',
            Cell: EntityCell
          },
          {
            Header: 'Job',
            accessor: 'job',
          },
          {
            Header: 'Role',
            accessor: 'role',
          },
          {
            Header: 'Gender',
            accessor: 'gender',
          },
          {
            Header: 'Building',
            accessor: 'building',
          },
          {
            Header: 'Health',
            accessor: 'conditionHealth',
          },
          {
            Header: 'Performance',
            accessor: 'conditionPerformance',
          },
        ],
        []
      )
    
      return (
        <EntityTable entityType="person" columns={columns} />
      )
};

export default PersonTable;

