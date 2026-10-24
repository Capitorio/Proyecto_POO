**Proyecto Comandas**

*• ¿Cuál es el alcance de su proyecto?*
Automatizar el ciclo completo del restaurante: captura de órdenes
por parte de los meseros, gestión de precios, modificación de pedidos
y el corte de caja administrativo al final del día.
*• ¿Qué problema resuelve?*
El descontrol en las comandas en papel, los errores humanos al
calcular cuentas y la falta de trazabilidad en el flujo de efectivo diario
*• Qué SI/NO incluye.*
si incluye: Alta de platillos, toma y edición de comandas, cálculo de
totales, registro de entradas/salidas de dinero y devoluciones.
no incluye: Conexión con impresoras térmicas reales, app móvil para
meseros o pagos con tarjeta
*• ¿Cuáles serían los requerimientos(iniciales)?*
Uso de estructuras de datos en Java, manejo de excepciones (para
evitar entradas de datos inválidas) y una interfaz basada en consola
interactiva o ventanas simples
• ¿Identifican algún riesgo?
*Errores lógicos al modificar una comanda ya activa que altere*
incorrectamente el total de la venta o el inventario temporal de caja

**INSTRUCCIONES DE LA MAESTRA**
*/Sugiero que definan una interface Producto con métodos:comida, bebida o postre./*

*/Cliente -- Pedido(1.Detalle del Pedido, 2.Producto, 3.EstadoPedido puede ser una enum: RECIBIDO, LISTO, ENTREGADO, CANCELADO,etc)/*

*/Lista<Productos> menu;/*

*/Empleado clase abstracta con Mesero y Administrador/*

*/Pedido--- Pago(Efectivo o Tarjeta)/*

*/Qué sigue?/*

*/1. Arquitectura con UMLs/*

*/2. Plan de actividades/*

*/3. Prototipo/*

