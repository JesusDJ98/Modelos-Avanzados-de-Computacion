import Data.List
import System.Random


data Propietario = Propietario { nombre :: String,
                                 edad :: Int
                               }deriving (Show)

getName :: Propietario -> String
getName (Propietario x _) = x
getEdad :: Propietario -> Int
getEdad (Propietario   _ x) = x
getCodigo :: Propietario -> Int
getCodigo (Propietario _ x) = x*20+2


data Moneda = Moneda { propietario :: Propietario,
                       anterior :: Float,
                       siguiente :: Float
                     }deriving (Show)

getPropietario :: Moneda -> Propietario
getPropietario (Moneda x _ _) = x
getSiguiente :: Moneda -> Float
getSiguiente (Moneda   _ _ x) = x
getAnterior :: Moneda -> Float
getAnterior (Moneda _ x _) = x

--setPropietario

ver :: Float -> Float
ver x = x
-- Aqui solo puedo modificar el valor de ver(x), pero no de la x

--mod :: (Float a Float b) => Float -> Float

--modificar :: (Moneda m, Float s) => m -> Moneda
--modificar m s = (Moneda _ _ x) -> x = s


-- Creo variable a usar
p = Propietario "Inicio" 0
yo = Moneda p 0 0


