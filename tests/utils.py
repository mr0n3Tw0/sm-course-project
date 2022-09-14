import yaml
import os


def scan_dirs(path):
    for entry in os.scandir(path):
        if os.path.isdir(entry):
            scan_dirs(entry)
        else:
            yield entry


def read_yaml(filename):
    with open(filename, "r") as file:
        data = yaml.load(file, Loader=yaml.FullLoader)

    return data


if __name__ == "__main__":
    cases = sorted(scan_dirs('cases'), key=lambda f: f.path)
    for i in cases:
        print(read_yaml(i))
