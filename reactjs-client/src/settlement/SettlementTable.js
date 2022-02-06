import { useMemo } from "react";
import EntityTable from "../common/EntityTable";
import { EntityCell } from "../common/LinkUtils";

const SettlementTable = () => {

    const columns = useMemo(
        () => [
          {
            Header: 'Name',
            accessor: 'name',
            Cell: EntityCell
          },
          {
            Header: 'Power',
            accessor: 'power',
          },
          {
            Header: 'Oxygen',
            accessor: 'oxygen',
          },
          {
            Header: 'Hydrogen',
            accessor: 'hydrogen',
          },
          {
            Header: 'Water',
            accessor: 'water',
          },
          {
            Header: 'Methane',
            accessor: 'methane',
          }
        ],
        []
      )

    return (
        <EntityTable entityType="settlement" columns={columns} />
      );
};

export default SettlementTable;

