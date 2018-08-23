module Clase2 where


--Segunda Clase--

-- Implementar suma binaria

data Bit = Zero | One
instance Show Bit where
    show(Zero) = "0"
    show(One) = "1"

type Binary = [Bit]

binarySum :: Binary -> Binary -> Bit -> Binary
binarySum [][] = []
binarySum [] y = y
binarySum x [] = x
binarySum x y =++ [snd bitSum last(x) last(y)]


bitSum :: Bit -> Bit -> (Bit, Bit)
bitSum Zero Zero = (Zero, Zero)
bitSum One One = (One, Zero)
bitSum _ _ = (Zero, One)

-- Definir tipo arbol y definir una funcion de construccion
-- Dado el tipo Graph [(nodo, [nodos vecinos])], determinar si existen ciclos.
-- Dado el tipo Graph de 3 determinar si existe camino entre dos nodos
-- Definir una funcion que retorne los primeros N numeros primos.
-- Resolver el problema de las 8 reinas.
-- Implementar el algoritmo de compresion de Huffman
-- Dado el tipo tree del punto 2, determinar la profundidad del arbol
-- Implementar una lista de contactos (Contact )



