package rover;

public enum Direction {

    NORTH {
        @Override
        public Direction leftDirection() {
            return WEST;
        }

        @Override
        public Direction rightDirection() {
            return EAST;
        }
    },
    EAST {
        @Override
        public Direction leftDirection() {
            return NORTH;
        }

        @Override
        public Direction rightDirection() {
            return SOUTH;
        }
    },
    WEST {
        @Override
        public Direction leftDirection() {
            return SOUTH;
        }

        @Override
        public Direction rightDirection() {
            return NORTH;
        }
    },
    SOUTH {
        @Override
        public Direction leftDirection() {
            return EAST;
        }

        @Override
        public Direction rightDirection() {
            return WEST;
        }
    };

    public abstract Direction leftDirection();

    public abstract Direction rightDirection();
}
