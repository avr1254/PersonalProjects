import input_data

mnist = input_data.read_data_sets("MNIST_data/", one_hot = True)

n_train = mnist.train.num_examples
n_validation = mnist.validation.num_examples
n_test = mnist.test.num_example