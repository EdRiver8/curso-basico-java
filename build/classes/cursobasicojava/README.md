## 1. Requisitos

### Requisitos Funcionales

1. **Gestión de Saldo para Servicios:**
   - El sistema debe permitir a los usuarios consultar el saldo disponible para 
cubrir los servicios realizados en el taller.
   - El sistema debe permitir registrar nuevos servicios realizados, incrementando 
el saldo adeudado por el cliente.
   - El sistema debe permitir registrar pagos realizados por el cliente, 
reduciendo el saldo adeudado.
   - El sistema debe permitir registrar costos adicionales por partes o 
servicios extra.

2. **Interacción con el Usuario:**
   - El sistema debe presentar un menú de opciones para que el usuario 
seleccione las acciones a realizar.
   - El sistema debe validar las entradas del usuario, asegurando que sean 
numéricas donde corresponda.
   - El sistema debe manejar situaciones en las que el usuario intente 
pagar más de lo que tiene disponible como saldo.

3. **Finalización del Servicio:**
   - El sistema debe permitir al usuario salir del programa en cualquier 
momento seleccionando la opción correspondiente.

### Requisitos No Funcionales

1. **Usabilidad:**
   - La interfaz debe ser sencilla e intuitiva, con mensajes claros para guiar 
al usuario en cada paso.
   - El sistema debe manejar errores de entrada de manera eficiente, 
proporcionando retroalimentación inmediata al usuario.

2. **Eficiencia:**
   - El sistema debe procesar las transacciones rápidamente, sin demoras 
perceptibles para el usuario.

---

## 2. Reglas de Negocio

1. **Consulta de Saldo:**
   - El saldo inicial ingresado por el usuario representa el monto disponible 
para cubrir los servicios en el taller.
   - Cualquier nuevo servicio o costo adicional registrado incrementará este saldo.

2. **Registro de Servicios:**
   - Los servicios realizados en el vehículo deben ser registrados con su costo 
correspondiente, que se sumará al saldo adeudado.

3. **Pagos:**
   - Los pagos realizados por el cliente deben restarse del saldo adeudado.
   - Si el monto del pago es mayor que el saldo disponible, el sistema debe 
rechazar la transacción y notificar al usuario.

4. **Costos Adicionales:**
   - Cualquier costo adicional registrado debe sumarse al saldo adeudado.

5. **Finalización:**
   - El sistema debe permitir al usuario finalizar la sesión en cualquier 
momento seleccionando la opción de salir.

---

## 3. Casos de Uso

### CU1: Consultar Saldo

**Descripción:** El usuario consulta el saldo disponible para cubrir los 
servicios realizados en el taller.

- **Actor:** Cliente
- **Precondiciones:** El usuario ha ingresado su nombre y el saldo inicial 
para servicios.
- **Postcondiciones:** El sistema muestra el saldo actual.

**Flujo Principal:**
1. El usuario selecciona la opción de consultar saldo.
2. El sistema muestra el saldo disponible.

---

### CU2: Registrar Servicio Realizado

**Descripción:** El usuario registra un nuevo servicio realizado en el vehículo.

- **Actor:** Cliente
- **Precondiciones:** El saldo inicial para servicios ha sido ingresado.
- **Postcondiciones:** El sistema incrementa el saldo adeudado con el costo 
del nuevo servicio.

**Flujo Principal:**
1. El usuario selecciona la opción de registrar un servicio.
2. El usuario ingresa el costo del servicio.
3. El sistema incrementa el saldo adeudado y confirma el registro del servicio.

---

### CU3: Realizar Pago

**Descripción:** El usuario realiza un pago para cubrir los servicios realizados.

- **Actor:** Cliente
- **Precondiciones:** El saldo adeudado es mayor que cero.
- **Postcondiciones:** El sistema decrementa el saldo adeudado con el monto del pago.

**Flujo Principal:**
1. El usuario selecciona la opción de realizar un pago.
2. El usuario ingresa el monto a pagar.
3. El sistema verifica si el monto a pagar es menor o igual al saldo adeudado.
   - **Flujo Alterno:** Si el monto es mayor, el sistema notifica que no hay 
fondos suficientes.
4. El sistema decrementa el saldo adeudado y confirma el pago.

---

### CU4: Registrar Costos Adicionales

**Descripción:** El usuario registra costos adicionales por partes o servicios extra.

- **Actor:** Cliente
- **Precondiciones:** El saldo inicial para servicios ha sido ingresado.
- **Postcondiciones:** El sistema incrementa el saldo adeudado con el costo adicional.

**Flujo Principal:**
1. El usuario selecciona la opción de registrar costos adicionales.
2. El usuario ingresa el costo adicional.
3. El sistema incrementa el saldo adeudado y confirma el registro del costo adicional.

---

### CU5: Salir del Programa

**Descripción:** El usuario finaliza la sesión y sale del programa.

- **Actor:** Cliente
- **Precondiciones:** El usuario ha terminado de realizar las transacciones deseadas.
- **Postcondiciones:** El sistema finaliza la ejecución.

**Flujo Principal:**
1. El usuario selecciona la opción de salir.
2. El sistema confirma la finalización y muestra un mensaje de despedida.

---

## 4. Casos de Prueba

### CP1: Consultar Saldo

- **Descripción:** Verificar que el sistema muestra el saldo correcto.
- **Entradas:** Saldo inicial de 1000.
- **Resultados Esperados:** El sistema muestra "Saldo actual disponible para 
servicios: 1000".

---

### CP2: Registrar Servicio Realizado

- **Descripción:** Verificar que el sistema incrementa el saldo al registrar 
un servicio.
- **Entradas:** Saldo inicial de 1000, costo del servicio de 300.
- **Resultados Esperados:** El saldo se incrementa a 1300, y el sistema confirma 
el registro del servicio.

---

### CP3: Realizar Pago Exitoso

- **Descripción:** Verificar que el sistema decremente el saldo al realizar un pago.
- **Entradas:** Saldo de 1300, monto del pago de 300.
- **Resultados Esperados:** El saldo se decrementa a 1000, y el sistema confirma 
el pago.

---

### CP4: Realizar Pago con Fondos Insuficientes

- **Descripción:** Verificar que el sistema no permite realizar un pago mayor al 
saldo disponible.
- **Entradas:** Saldo de 1000, monto del pago de 1500.
- **Resultados Esperados:** El sistema rechaza el pago y muestra un mensaje de 
"Fondos insuficientes".

---

### CP5: Registrar Costos Adicionales

- **Descripción:** Verificar que el sistema incrementa el saldo al registrar un 
costo adicional.
- **Entradas:** Saldo de 1000, costo adicional de 200.
- **Resultados Esperados:** El saldo se incrementa a 1200, y el sistema confirma 
el registro del costo adicional.

---

### CP6: Salir del Programa

- **Descripción:** Verificar que el sistema finaliza correctamente cuando el 
usuario selecciona la opción de salir.
- **Entradas:** Opción de salida seleccionada.
- **Resultados Esperados:** El sistema muestra un mensaje de despedida y 
finaliza la ejecución.

