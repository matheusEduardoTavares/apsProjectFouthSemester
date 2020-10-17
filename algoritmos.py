import sys
import matplotlib.pyplot as plt
argTime = sys.argv[1].split(',')
time = list(map(int, argTime))
algorithms = sys.argv[2].split(',')
colors = ['blue', 'green', 'red', 'black']

for i in range(len(algorithms)):
    plt.plot([0, time[i]], ['início', 'fim'], label=algorithms[i].replace('Sort', ' Sort'), color=colors[i])

plt.ylabel('Início e fim da execução')
plt.xlabel('Tempo em milissegundos para ordenação')
plt.title('Gráfico de execução dos algoritmos de ordenação')
fig = plt.gcf()
fig.canvas.set_window_title('APS')
plt.legend()
plt.show()
