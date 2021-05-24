//exportamos el contrato
const HistoriaClinica = artifacts.require("HistoriaClinica");

// libreria para manejar dates
const moment = require("moment");

// libreria para hacer test
const chai = require("chai");
const chaiAsPromised = require("chai-as-promised");
chai.use(chaiAsPromised);
const expect = chai.expect;

contract("HistoriaClinica", (accounts) => {
  //by default acc[0] is owner
  const owner = accounts[0];
  // default behaviour of any contract
  describe("Contract instance", () => {
    it("should retrieve a non-null instance of the contract", () => {
      return HistoriaClinica.deployed().then((instance) => {
        historiaClinica = instance;
        expect(historiaClinica).not.to.be.null;
      });
    });
    it("should be registered with owner acc", () => {
      return historiaClinica.owner().then((registeredOwnser) => {
        expect(registeredOwnser).to.eq(owner);
      });
    });
  });

  describe("historiaClinica information", () => {
    const id = 1234;
    const hash = "8743b52063cd84097a65d1633f5c74f5";
    const timestamp = parseInt(moment().format("x"));

    it("should add a new historia clinica", () => {
      return historiaClinica
        .addDocument(id, hash,timestamp)
        .then((response) => {
          expect(response.tx).to.match(/0x[a-fA-F0-9]{64}/);
        });
    });

    it("should retreive document by user id", () => {
      return historiaClinica.getDocument(id).then((response) => {
        const [a, b] = Object.values(response);
        console.log(a.toString());
        console.log(b.toString())
        expect(a.toString()).to.eq(hash);
        expect(b.toString()).to.eq(timestamp.toString());
      });
    });
  });
});