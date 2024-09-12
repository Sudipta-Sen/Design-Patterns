# Define directories
SRC_DIR = main/java/com/designpatterns
BIN_DIR = bin

# Behavioral sub-packages
BEHAVIORAL_OBSERVER_SRC = $(wildcard Behavioral/ObserverPattern/**/*.java) Behavioral/ObserverPattern/main.java
BEHAVIORAL_STRATEGY_SRC = $(wildcard Behavioral/strategy/**/*.java) Behavioral/strategy/main.java
STRUCTUAL_DECORATOR_SRC = $(wildcard Structural/DecoratorPattern/**/*.java) Structural/DecoratorPattern/main.java
STRUCTUAL_ADAPTER_SRC = $(wildcard Structural/AdapterPattern/**/*.java) Structural/AdapterPattern/ECommercePlatform.java
STRUCTUAL_FACADE_SRC = $(wildcard Structural/FacadePattern/**/*.java) Structural/FacadePattern/client.java
STRUCTUAL_PROXY_SRC = $(wildcard Structural/ProxyPattern/**/*.java) Structural/ProxyPattern/client.java
CREATIONAL_FACTORY_SRC = $(wildcard Creational/AbstractFactoryPattern/**/*.java) Creational/AbstractFactoryPattern/main.java
CREATIONAL_BUILDER_SRC = $(wildcard Creational/BuilderPAttern/**/*.java) Creational/BuilderPAttern/main.java

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

structural: structural_decorator structural_adapter structural_facade structural_proxy

structural_decorator: $(STRUCTUAL_DECORATOR_SRC)
	@mkdir -p $(BIN_DIR)
	echo $(STRUCTUAL_DECORATOR_SRC)
	javac -d $(BIN_DIR) $(STRUCTUAL_DECORATOR_SRC)

structural_adapter: $(STRUCTUAL_ADAPTER_SRC)
	@mkdir -p $(BIN_DIR)
	echo $(STRUCTUAL_ADAPTER_SRC)
	javac -d $(BIN_DIR) $(STRUCTUAL_ADAPTER_SRC)

structural_facade: $(STRUCTUAL_FACADE_SRC)
	@mkdir -p $(BIN_DIR)
	echo $(STRUCTUAL_FACADE_SRC)
	javac -d $(BIN_DIR) $(STRUCTUAL_FACADE_SRC)

structural_proxy: $(STRUCTUAL_PROXY_SRC)
	@mkdir -p $(BIN_DIR)
	echo $(STRUCTUAL_PROXY_SRC)
	javac -d $(BIN_DIR) $(STRUCTUAL_PROXY_SRC)

creational: creational_factory creational_builder

creational_factory: $(CREATIONAL_FACTORY_SRC)
	@mkdir -p $(BIN_DIR)
	echo $(CREATIONAL_FACTORY_SRC)
	javac -d $(BIN_DIR) $(CREATIONAL_FACTORY_SRC)

creational_builder: $(CREATIONAL_BUILDER_SRC)
	@mkdir -p $(BIN_DIR)
	echo $(CREATIONAL_BUILDER_SRC)
	javac -d $(BIN_DIR) $(CREATIONAL_BUILDER_SRC)

# Clean up compiled classes
clean:
	rm -rf $(BIN_DIR)

# Phony targets
.PHONY: all Behavioral behavioral_observer behavioral_strategy clean
