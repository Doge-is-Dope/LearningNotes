"""
GameEntry represents a game entry
"""


class GameEntry:
    def __init__(self, name, score):
        self.name = name  # name of the person earning this score
        self.score = score  # the score value

    def __str__(self):
        # Returns a string representation of the entry
        return "Name: {}, Score: {}".format(self.name, self.score)

    def get_name(self):
        # Returns the name field
        return self.name

    def get_score(self):
        # Returns the score field
        return self.score


class ScoreBoard:
    def __init__(self):
        self.num_entries = 0  # number of actual entries
        self.board = []  # list of game entries (names & scores)

    def add(self, game_entry: GameEntry):
        self.board.append(game_entry)
        self.num_entries += 1

    def remove(self, index: int):
        if 0 <= index < self.num_entries:
            self.board.remove(self.board[index])
            self.num_entries -= 1

    def __str__(self):
        return "[" + ", ".join(map(str, self.board)) + "]"


if __name__ == '__main__':
    b = ScoreBoard()
    b.add(GameEntry("Mike", 1105))
    b.add(GameEntry("Rob", 750))
    b.add(GameEntry("Jill", 123))
    print(b)
