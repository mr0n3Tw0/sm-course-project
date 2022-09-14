import requests
import pytest
from utils import scan_dirs, read_yaml
from case import Case
from validator import Validator

CASES = sorted(scan_dirs('cases'), key=lambda f: f.path)


@pytest.mark.parametrize("case", CASES, ids=lambda case: case.name)
def test_main(case):
    test = Case(read_yaml(case))
    actual = requests.request(**test.request)
    Validator.check_result(test.expected, actual)


if __name__ == "__main__":
    test_main()
