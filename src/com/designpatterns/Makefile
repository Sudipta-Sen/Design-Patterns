# Define directories
SRC_DIR = main/java/com/designpatterns
BIN_DIR = bin

# Behavioral sub-packages
BEHAVIORAL_OBSERVER_SRC = $(wildcard Behavioral/observer/**/*.java) 
BEHAVIORAL_STRATEGY_SRC = $(wildcard Behavioral/strategy/**/*.java) Behavioral/strategy/main.java

# Default target
all: behavioral observer strategy

# Target for compiling all Behavioral sub-packages
behavioral: behavioral_observer behavioral_strategy

# Target for compiling observer sub-package
behavioral_observer: $(BEHAVIORAL_OBSERVER_SRC)
	@mkdir -p $(BIN_DIR)
	echo $(BEHAVIORAL_OBSERVER_SRC)
	javac -d $(BIN_DIR) $(BEHAVIORAL_OBSERVER_SRC)
	@touch $(BIN_DIR).compiled

# Target for compiling strategy sub-package
behavioral_strategy: $(BEHAVIORAL_STRATEGY_SRC)
	@mkdir -p $(BIN_DIR)
	echo $(BEHAVIORAL_STRATEGY_SRC)
	javac -d $(BIN_DIR) $(BEHAVIORAL_STRATEGY_SRC)

# Clean up compiled classes
clean:
	rm -rf $(BIN_DIR)

# Phony targets
.PHONY: all Behavioral behavioral_observer behavioral_strategy clean
