const dbName = "parquimetro";
const db = db.getSiblingDB(dbName);

db.createCollection("Usuario");
db.createCollection("Reserva");
db.createCollection("Regiao");
db.createCollection("Vaga");
db.createCollection("Fiscal");

// Dados dummy
db.Usuarios.insertMany([
  {
    nome: "João Silva",
    cpf: "12345678900",
    email: "joao.silva@example.com",
    numeroCelular: "11987654321",
    placasCarro: ["ABC1234"],
    preferencias: { notificacoesAtivas: true },
    dataCriacao: new Date(),
    dataUltimaAtualizacao: new Date(),
  }
]);

db.Reserva.insertMany([
  {
    tempoSolicitadoMinutos: 60,
    horarioInicio: new Date(),
    horarioFimEstimado: new Date(new Date().getTime() + 60 * 60 * 1000),
    horarioFimReal: null,
    tempoUsadoMinutos: null,
    valorPago: { valor: NumberDecimal("5.00"), moeda: "BRL" },
    status: "Ativa",
    dataCriacao: new Date(),
    dataUltimaAtualizacao: new Date(),
    usuarioId: ObjectId(),
    usuario: { nome: "João Silva", cpf: "12345678900", placaCarro: "ABC1234" },
    vagaId: ObjectId(),
    vaga: { numero: 10 },
    regiaoId: ObjectId(),
    regiao: { nome: "Centro", tarifaPorMinuto: { valor: NumberDecimal("0.10"), moeda: "BRL" } }
  }
]);

db.Regiao.insertMany([
  {
    nome: "Centro",
    descricao: "Região central da cidade",
    zona: "A",
    tarifaPorMinuto: { valor: NumberDecimal("0.10"), moeda: "BRL" },
    tempoToleranciaMinutos: 5,
    dataCriacao: new Date(),
    dataUltimaAtualizacao: new Date(),
  }
]);

db.Vaga.insertMany([
  {
    regiaoId: ObjectId(),
    numero: 10,
    disponivel: true,
    localizacao: { latitude: -23.563210, longitude: -46.654321 },
    dataCriacao: new Date(),
    dataUltimaAtualizacao: new Date(),
  }
]);

db.Fiscal.insertMany([
  {
    nome: "Admin Fiscal",
    cnpj: "12345678000199",
    email: "fiscal@example.com",
    numeroCelular: "11912345678",
    dataCriacao: new Date(),
    dataUltimaAtualizacao: new Date(),
  }
]);

print(`Banco de dados '${dbName}' e collections criados com sucesso!`);
