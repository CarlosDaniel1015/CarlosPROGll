Perro = {}

Perro["Nombre"] = "Carlos"
Perro["Color"] = "Blanco"
Perro["Raza"] = "Shih Tzu"
Perro["Patas"] = "4"
Perro["Edad"] = "18"

Estudiantes = {
    
    "Nombre": "Carlos",
    "Apellido": "Ortiz",
    "Edad": "18",
    "Sexo": "Hombre",
    "E.C": "Casado",
    "Habilidades": ["Anything"],
    "Pais": "Colombia",
    "Ciudad": "Cartagena",
    "Direccion": "Olaya",

}

print("\n")
print("La lista tiene", len(Estudiantes), "elementos")
print("\n")
print("Las habilidades del estudiante son", Estudiantes.get("Habilidades"))


Estudiantes["Habilidades"].append("All")
print(Estudiantes.get("Habilidades"))
print("\n")

keys=Estudiantes.keys()
print(keys)

value=Estudiantes.values()
print(value)

print(Estudiantes.items())

print("\n")
Estudiantes.pop("Apellido")
print(Estudiantes)



print("\nLas listas son las siguientes:")
print(Perro)
del Estudiantes
