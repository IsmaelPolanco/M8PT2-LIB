export function calcularmedia(numeros) {
    let suma = 0;
    for (const numero of numeros) {
        suma += numero;
    }
    return suma /numeros.length;
}
