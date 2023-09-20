#!/usr/bin/env groovy

def call(name, version, tag) {
  echo "Orewa, Namikaze Minato ${name} ${version} ${tag}"
  sh "node --version"
}
