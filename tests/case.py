import os


class Case:

    def __init__(self, data):
        self.request = data['request']
        self.request['url'] = os.environ['DVS_HOSTNAME'] + data['request']['url']
        self.expected = data['expected']
        self.meta = data['metadata']
