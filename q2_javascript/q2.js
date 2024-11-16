const prompt = require("prompt-sync")({sigint: true})

// Desenvolver abaixo.


function fatorial(numero) {
  if (numero === 0)
    return 1;
  return numero * fatorial(numero-1);
}

const entrada = prompt("Digite um número entre 0 e 100.");
const numero = parseInt(entrada);

if (numero >= 0 && numero <= 100) {
  const valor = fatorial(numero);
  console.log(`O fatorial do número ${numero} é ${valor}.`);
} else {
  console.log('Informe um número maior que 0 e menor que 100.');
}
