/*
 * Copyright 2021 Typelevel
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package feral.lambda.events

import io.circe.literal._
import munit.FunSuite

class ApiGatewayProxyEventV2Suite extends FunSuite {

  import ApiGatewayProxyEventV2Suite._

  test("decoder") {
    event.as[ApiGatewayProxyEventV2].toTry.get
  }

}

object ApiGatewayProxyEventV2Suite {

  def event = json"""
  {
    "version": "2.0",
    "routeKey": "ANY /nodejs-apig-function-1G3XMPLZXVXYI",
    "rawPath": "/default/nodejs-apig-function-1G3XMPLZXVXYI",
    "rawQueryString": "",
    "cookies": [
      "s_fid=7AABXMPL1AFD9BBF-0643XMPL09956DE2",
      "regStatus=pre-register"
    ],
    "headers": {
      "accept": "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
      "accept-encoding": "gzip, deflate, br",
      "accept-language": "en-US,en;q=0.9",
      "content-length": "0",
      "host": "r3pmxmplak.execute-api.us-east-2.amazonaws.com",
      "sec-fetch-dest": "document",
      "sec-fetch-mode": "navigate",
      "sec-fetch-site": "cross-site",
      "sec-fetch-user": "?1",
      "upgrade-insecure-requests": "1",
      "user-agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.132 Safari/537.36",
      "x-amzn-trace-id": "Root=1-5e6722a7-cc56xmpl46db7ae02d4da47e",
      "x-forwarded-for": "205.255.255.176",
      "x-forwarded-port": "443",
      "x-forwarded-proto": "https"
    },
    "requestContext": {
      "accountId": "123456789012",
      "apiId": "r3pmxmplak",
      "domainName": "r3pmxmplak.execute-api.us-east-2.amazonaws.com",
      "domainPrefix": "r3pmxmplak",
      "http": {
        "method": "GET",
        "path": "/default/nodejs-apig-function-1G3XMPLZXVXYI",
        "protocol": "HTTP/1.1",
        "sourceIp": "205.255.255.176",
        "userAgent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.132 Safari/537.36"
      },
      "requestId": "JKJaXmPLvHcESHA=",
      "routeKey": "ANY /nodejs-apig-function-1G3XMPLZXVXYI",
      "stage": "default",
      "time": "10/Mar/2020:05:16:23 +0000",
      "timeEpoch": 1583817383220
    },
    "isBase64Encoded": true
  }
  """

}
