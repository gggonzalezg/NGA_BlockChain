// SPDX-License-Identifier: MIT
pragma solidity >=0.4.22 <0.9.0;

contract HistoriaClinica {
    address public owner;
    string public name;


    constructor() public {
        // la primerizima pimer vez que se despliega el contrato, el el msg.sender es el owner
        owner = msg.sender;
    }

    // un modifier para que solo la cuenta del owner haga la operacion
    modifier onlyOwner() {
        require(
            msg.sender == owner,
            "You are not authorized, you must be the owner"
        );
        _;
    }

    mapping(uint => Document) document;

    struct Document {
        string hashedDoc;
        uint id;
        uint timestamp;
    }

    function addDocument(
        uint _id,
        string memory _hashedDoc,
        uint _timestamp
    ) public onlyOwner {
        document[_id] = Document({
            hashedDoc: _hashedDoc,
            id: _id,
            timestamp: _timestamp
        });
    }

    function getDocument(uint _id)
    public //Cualquier user puede acceder al bloque
    view   //No consume ether.
    returns(
        string memory,
        uint
    )
    {
        Document memory doctmp = document[_id];
        return (
            doctmp.hashedDoc,
            doctmp.timestamp
        );
    }
}
