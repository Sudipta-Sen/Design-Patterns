# Define directories
SRC_DIR = main/java/com/designpatterns
BIN_DIR = bin

# Behavioral sub-packages
BEHAVIORAL_OBSERVER_SRC = $(wildcard Behavioral/ObserverPattern/**/*.java) Behavioral/ObserverPattern/main.java
BEHAVIORAL_STRATEGY_SRC = $(wildcard Behavioral/strategy/**/*.java) Behavioral/strategy/main.java
STRUCTUAL_DECORATOR_SRC = $(wildcard Structural/DecoratorPattern/**/*.java) Structural/DecoratorPattern/main.java
CREATIONAL_FACTORY_SRC = $(wildcard Creational/AbstractFactoryPattern/**/*.java) Creational/AbstractFactoryPattern/main.java

# Default target
all: behavioral structural creational

# Target for compiling all Behavioral sub-packages
behavioral: behavioral_observer behavioral_strategy

# Target for compiling observer sub-package
behavioral_observer: $(BEHAVIORAL_OBSERVER_SRC)
	@mkdir -p $(BIN_DIR)
	echo $(BEHAVIORAL_OBSERVER_SRC)
	javac -d $(BIN_DIR) $(BEHAVIORAL_OBSERVER_SRC)

# Target for compiling strategy sub-package
behavioral_strategy: $(BEHAVIORAL_STRATEGY_SRC)
	@mkdir -p $(BIN_DIR)
	echo $(BEHAVIORAL_STRATEGY_SRC)
	javac -d $(BIN_DIR) $(BEHAVIORAL_STRATEGY_SRC)

structural: structural_decorator

structural_decorator: $(STRUCTUAL_DECORATOR_SRC)
	@mkdir -p $(BIN_DIR)
	echo $(STRUCTUAL_DECORATOR_SRC)
	javac -d $(BIN_DIR) $(STRUCTUAL_DECORATOR_SRC)

creational: creational_factory

creational_factory: $(CREATIONAL_FACTORY_SRC)
	@mkdir -p $(BIN_DIR)
	echo $(CREATIONAL_FACTORY_SRC)
	javac -d $(BIN_DIR) $(CREATIONAL_FACTORY_SRC)


# Clean up compiled classes
clean:
	rm -rf $(BIN_DIR)

# Phony targets
.PHONY: all Behavioral behavioral_observer behavioral_strategy clean
