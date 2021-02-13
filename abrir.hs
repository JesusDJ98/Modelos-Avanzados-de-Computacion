import Data.List
import System.Random


data Propietario = Propietario { nombre :: String,
                                 edad :: Int,
                                 codigo :: Float
                               }deriving (Show)

data Moneda = Moneda { propietario :: Propietario,
                       anterior :: Float,
                       siguiente :: Float
                     }deriving (Show)

verPropietario :: Moneda -> Propietario
verPropietario (Moneda x _ _) = x
verMiSiguiente :: Moneda -> Float
verMiSiguiente (Moneda   _ _ x) = x
verMiAnterior :: Moneda -> Float
verMiAnterior (Moneda _ x _) = x

modificar :: (Moneda m, Float s) => m -> (Moneda _ _ s)
modificar m s = do m = Moneda _ _ s


-- Creo variable a usar
p = Propietario "Inicio" 0 0.0
yo = Moneda p 0 0


