const HistoriaClinica = artifacts.require("HistoriaClinica");

module.exports = function (deployer) {
  deployer.deploy(HistoriaClinica);
};