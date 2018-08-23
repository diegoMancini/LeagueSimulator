module Clase1 where


main :: IO ()
main = print(2)

invertir :: [Int] -> [Int]
invertir [] = []
invertir (x:xs) = invertir xs ++ [x]


sumarTodo :: [Int] -> Int
sumarTodo [] = 0
sumarTodo (x:xs) = x + sumarTodo(xs)

mayorElem :: [Int] -> Int
mayorElem [x] = x
mayorElem (x:xs) = if(x > head xs) then mayorElem (x : tail xs) else mayorElem(head xs: tail xs)


--Fibonacci

fibo :: Int -> Int
fibo 0 = 0
fibo 1 = 1
fibo x = fibo(x-1) + fibo(x-2)


--invertir de a pares--

permutar :: [Int] -> [Int]
permutar [] = []
permutar [x] = [x]
permutar(x:xs) = [head xs, x] ++ permutar (tail xs)

--Ordenar Tuplas--

ordenarTuplas :: (Ord x) => [(x,y)] -> [(x,y)]
ordenarTuplas [] = []
ordenarTuplas (x:xs) = ordenarTuplas[ z | z <- xs, fst z <= fst x] ++ [x] ++ ordenarTuplas[ z | z <- xs, fst z > fst x]


--Lista es capicua--

capicua :: (Eq a) => [a] -> Bool

capicua (x:xs) = if(x == last xs) then capicua (init xs) else False
capicua [] = True

-- Implementar el insert --

insert :: [a] -> a -> Int -> [a]

insert [] _ _ = []
insert lista y i = take i lista ++ [y] ++ drop i lista

-- Length de una lista --

largo :: [a] -> Int

largo [] = 0
largo (x:xs) = 1 + largo xs

-- numero de veces que aparece algo --

amt :: (Eq a) => [a] -> a -> Int

amt [] _ = 0
amt (x:xs) y = if x == y then 1 + amt xs y else amt xs y


















