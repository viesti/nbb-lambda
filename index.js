exports.handler = async function(event, context) {
  const { loadFile } = await import('nbb');
  return loadFile("core.cljs").then(handler => handler(event, context));
};
