def make_bricks(small, big, goal):
  newBig = big * 5
  newGoal = small + newBig
  if (newGoal == goal):
    return True
  return False
