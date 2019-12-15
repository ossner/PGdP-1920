package Week9;

// This serves as an example for enumerators
// Enumerators are special "classes" in Java that represent
// explicit sets of Objects you may want to operate on
public enum Temperatures {
    Celsius {
        @Override
        public String toString() {
            return "°C";
        }
    },
    Fahrenheit {
        @Override
        public String toString() {
            return "°F";
        }
    },
    Kelvin {
        @Override
        public String toString() {
            return "K";
        }
    },
    Rankine {
        @Override
        public String toString() {
            return "°Ra";
        }
    },
    Reaumur {
        @Override
        public String toString() {
            return "°Re";
        }
    }
}
