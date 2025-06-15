"""First cirq program"""

try:
    import cirq
except ImportError:
    print("cirq not installed")
# To install cirq in a jupyter notebook, use the following code
#     print("installing cirq...")
#     !pip install --quiet cirq
#     import cirq

#     print("installed cirq.")


qubit = cirq.GridQubit(0, 0)

circuit = cirq.Circuit(cirq.X(qubit) ** 0.5, cirq.measure(qubit, key='m'))
print("Circuit:")
print(circuit)

simulator = cirq.Simulator()
result = simulator.run(circuit, repetitions=20)
print("Results:")
print(result)
