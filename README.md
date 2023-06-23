# PrimesNumbers
<h1>
  Este é um código Java que implementa a Diretiva Primal, que tem o objetivo de identificar números primos em um conjunto de números. A classe principal é chamada PrimeDirective e contém dois métodos principais: isPrime e onlyPrimes.

Principais recursos do código:

 • O método isPrime verifica se um número dado é primo. Ele recebe um número inteiro como entrada e itera de 1 até esse número, contando a quantidade de divisores encontrados. Se o número de divisores for igual a 2, o método retorna true, indicando que o número é primo. Caso contrário, retorna false.
 • O método onlyPrimes recebe um array de inteiros e retorna um ArrayList contendo apenas os números primos encontrados no array. Ele itera sobre cada número do array e chama o método isPrime para verificar se é primo. Se for, o número é adicionado ao ArrayList de primos.
 • O método main é usado para testar o código. Ele cria um objeto PrimeDirective, define um array de números de exemplo e chama o método onlyPrimes para obter uma lista de números primos. Em seguida, imprime a lista de números primos.
 • A classe PrimeDirective é projetada para ajudar a identificar e trabalhar com números primos. Ela oferece métodos para verificar se um número é primo e filtrar um conjunto de números, retornando apenas os números primos encontrados.
</h1>
