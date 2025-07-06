"""
Program to get to grips with the basics of cirq.
Following https://quantumai.google/cirq/start/basics
"""

try:
    import cirq
except ImportError:
    print("cirq not installed")

import cirq_google

# Using named qubits can be useful for abstract algorithms
# as well as algorithms not yet mapped onto hardware.
q0 = cirq.NamedQubit("source")
q1 = cirq.NamedQubit("target")

# Line qubits can be created individually
q3 = cirq.LineQubit(3)

# Or created in a range
# This will create LineQubit(0), LineQubit(1), LineQubit(2)
q0, q1, q2 = cirq.LineQubit.range(3)

# Grid Qubits can also be referenced individually
q4_5 = cirq.GridQubit(4, 5)

# Or created in bulk in a square
# This will create 16 qubits from (0,0) to (3,3)
qubits = cirq.GridQubit.square(4)

#print(cirq_google.Sycamore)

# Example gates
cnot_gate = cirq.CNOT
pauli_z = cirq.Z

sqrt_x_gate = cirq.X**0.5

# Some gates can also take parameters
sqrt_sqrt_y = cirq.YPowGate(exponent=0.25)

# Create two qubits at once, in a line.
q0, q1 = cirq.LineQubit.range(2)

# Example operations
z_op = cirq.Z(q0)
not_op = cirq.CNOT(q0, q1)
sqrt_iswap_op = cirq.SQRT_ISWAP(q0, q1)

# You can also use the gates specified earlier.
cnot_op = cnot_gate(q0, q1)
pauli_z_op = pauli_z(q0)
sqrt_x_op = sqrt_x_gate(q0)
sqrt_sqrt_y_op = sqrt_sqrt_y(q0)


# circuit = cirq.Circuit()
# qubits = cirq.LineQubit.range(3)
# circuit.append(cirq.H(qubits[0]))
# circuit.append(cirq.H(qubits[1]))
# circuit.append(cirq.H(qubits[2]))
# print(circuit)

# circuit = cirq.Circuit()
# ops = [cirq.H(q) for q in cirq.LineQubit.range(3)]
# circuit.append(ops)
# print(circuit)

# circuit = cirq.Circuit()
# circuit.append(cirq.H(q) for q in cirq.LineQubit.range(3))
# print(circuit)
# print(cirq.Circuit(cirq.H(q) for q in cirq.LineQubit.range(3)))

# print(cirq.Circuit(cirq.SWAP(q, q + 1) for q in cirq.LineQubit.range(3)))

# print(cirq.Circuit(cirq.Moment([cirq.H(q)]) for q in cirq.LineQubit.range(3)))

q0 = cirq.GridQubit(5, 6)
q1 = cirq.GridQubit(5, 5)
q2 = cirq.GridQubit(4, 5)

adjacent_op = cirq_google.SYC(q0, q1)
nonadjacent_op = cirq_google.SYC(q0, q2)

# A working circuit for the Sycamore device raises no issues.
working_circuit = cirq.Circuit()
working_circuit.append(adjacent_op)
valid = cirq_google.Sycamore.validate_circuit(working_circuit)

# A circuit using invalid operations.
bad_circuit = cirq.Circuit()
bad_circuit.append(nonadjacent_op)
try:
    cirq_google.Sycamore.validate_circuit(bad_circuit)
except ValueError as e:
    print(e)

