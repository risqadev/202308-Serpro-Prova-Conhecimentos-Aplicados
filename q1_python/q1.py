def ordenacao(numeros):
  for x in range(len(numeros)-1):
    for y in range(len(numeros)-1):
      if(numeros[y]>numeros[y+1]):
        temp = numeros[y]
        numeros[y] = numeros[y+1]
        numeros[y+1] = temp
  return numeros

numeros = [4, 2, 3, 10, 8]
print("Lista desordenada:")
print(numeros)
print(f'Lista ordenada:\n{ordenacao(numeros)}')
