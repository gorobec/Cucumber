$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("simple.feature");
formatter.feature({
  "line": 1,
  "name": "test my app",
  "description": "",
  "id": "test-my-app",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 11,
  "name": "simple atm actions",
  "description": "",
  "id": "test-my-app;simple-atm-actions",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 10,
      "name": "@Main"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "client insert card \u003cCard\u003e into atm",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "client enter \u003cpin\u003e pin",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "client try withdraw \u003ccash\u003e cash",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "client get \u003cres\u003e dollars",
  "keyword": "Then "
});
formatter.examples({
  "line": 17,
  "name": "",
  "description": "",
  "id": "test-my-app;simple-atm-actions;",
  "rows": [
    {
      "cells": [
        "Card",
        "pin",
        "cash",
        "res"
      ],
      "line": 18,
      "id": "test-my-app;simple-atm-actions;;1"
    },
    {
      "cells": [
        "\"1234 0000 6565 0000\"",
        "\"1111\"",
        "\"200\"",
        "\"200\""
      ],
      "line": 19,
      "id": "test-my-app;simple-atm-actions;;2"
    },
    {
      "cells": [
        "\"1234 0000 6565 0000\"",
        "\"1111\"",
        "\"100\"",
        "\"100\""
      ],
      "line": 20,
      "id": "test-my-app;simple-atm-actions;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 439019,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "simple atm actions",
  "description": "",
  "id": "test-my-app;simple-atm-actions;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 10,
      "name": "@Main"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "client insert card \"1234 0000 6565 0000\" into atm",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "client enter \"1111\" pin",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "client try withdraw \"200\" cash",
  "matchedColumns": [
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "client get \"200\" dollars",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "1234 0000 6565 0000",
      "offset": 20
    }
  ],
  "location": "StepDefinitions.clientInsertCard(String)"
});
formatter.result({
  "duration": 359963549,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1111",
      "offset": 14
    }
  ],
  "location": "StepDefinitions.clientEnterPin(int)"
});
formatter.result({
  "duration": 6627496,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 21
    }
  ],
  "location": "StepDefinitions.clientTryWithdrawCash(int)"
});
formatter.result({
  "duration": 807614,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 12
    }
  ],
  "location": "StepDefinitions.clientGetDollars(int)"
});
