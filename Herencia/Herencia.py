class lote:
    
    def __init__(self, largo, ancho, constructora):
        self.largo = largo
        self.ancho = ancho
        self.constructora = constructora
        
    def printconstructora(self):
        print(self.constructora)
        
    def calculararea(self):
        print (self.largo*self.ancho)
        
        
class casa (lote):
    def __init__ (self, largo, ancho, constructora, propietario, telefono):
        super().__init__(largo, ancho, constructora)
        self.propietario = propietario
        self.telefono = telefono
        
    def printpropietario(self):
        print(self.propietario)
        
    def printtelefono(self):
        print(self.telefono)
        
l = casa (1 , 1 , "unitecnar", "carlos" , "123456")

l.printconstructora()
l.printpropietario()
l.printtelefono()
l.calculararea()



