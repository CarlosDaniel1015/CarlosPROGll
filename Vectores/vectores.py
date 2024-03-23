lista_vacia = [ ]
lista = ["Carlos", "Daniel", "Ortiz", "Galvis", "18", "Hombre", "relacion"]

print("El numero total de elementos son: ", len(lista))

print("El primer elemento es: ", lista[0])
print("El elemento del medio es: ", lista[3])
print("El ultimo elemento es: ", lista[6])
print("\n")

Datos_personales = [ ]
Datos_personales.append("Carlos")
Datos_personales.append("18")
Datos_personales.append("200cm")
Datos_personales.append("relacion")
Datos_personales.append("Olaya")

it_companies = ["Facebook", "Google", "Microsoft", "Apple", "IBM", "Oracle", "Amazon"]
it_companies.insert(8, "Cocacola")
print(it_companies)

elemento = "Oracle"
if elemento in it_companies:
    indice = it_companies.index(elemento)
    print(f'El emenento {elemento} sí se encuentra en el indice {indice}')
else:
    print('El elemento no está en la lista')
    
print("\n")
    
it_companies.sort()
print("La lista ordenada es: ",it_companies)

it_companies.reverse()
print("La lista inversa es:", it_companies)
print("\n")

print("La lista es: " ,it_companies)
del(it_companies[0])
print("La lista con el primer elemento borrado es: " ,it_companies)

valor = it_companies.pop(2)
print("El valor que fue eliminado es: " ,valor )
print("La lista actualizada es: " ,it_companies)

element = it_companies.clear()
print("La lista sin los elementos es: " ,it_companies)