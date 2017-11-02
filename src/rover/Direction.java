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

        @Override
        public String representation() {
            return "N";
        }

        @Override
        public Point offset() {
            return new Point(0,1);
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

        @Override
        public String representation() {
            return "E";
        }

        @Override
        public Point offset() {
            return new Point(1,0);
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

        @Override
        public String representation() {
            return "W";
        }

        @Override
        public Point offset() {
            return new Point(-1,0);
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

        @Override
        public String representation() {
            return "S";
        }

        @Override
        public Point offset() {
            return new Point(0,-1);
        }
    };

    public abstract Direction leftDirection();

    public abstract Direction rightDirection();

    public abstract String representation();

    public abstract Point offset();
}
